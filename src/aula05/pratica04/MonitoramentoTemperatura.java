package aula05.pratica04;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MonitoramentoTemperatura {
    public static void main(String[] args) {
        // Criação de um ScheduledExecutorService
        // com um pool de threads fixo de tamanho 1
        ScheduledExecutorService scheduler =
                Executors.newScheduledThreadPool(1);
        // Tarefa de coleta de dados de
        // temperatura (executada a cada 3 segundos)
        Runnable coletaDeTemperatura = ()-> {
            double temperatura = coletarTemperatura();
            System.out.println("Temperatura atual: " + String.format("%.2f", temperatura) + "°C");
        };
        // Agendamento da tarefa de coleta de
        // dados com taxa fixa (fixed-rate)
        scheduler.scheduleAtFixedRate(
                coletaDeTemperatura,
                0,
                3,
                TimeUnit.SECONDS);
        // agendar o encerramento do serviço após 30 segundos

        scheduler.schedule(()-> {
            scheduler.shutdown();
            System.out.println("Encerrando o serviço de " +
                    "monitoramento de temperatura.");
        }, 30, TimeUnit.SECONDS);
    }

    // Método para simular a coleta de
    // dados de temperatura
    private static double coletarTemperatura() {
        // Simulando a leitura de temperatura
        // com valores aleatórios entre 10°C e 50°C
        return 10 + (Math.random() * 40);
    }
}