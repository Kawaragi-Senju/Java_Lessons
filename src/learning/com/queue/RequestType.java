package learning.com.queue;

public enum RequestType {
    WRITEDOWN,
    PASSING,
    BLOCK,
    UNBLOCK;
}
//Запрос – это класс, состоящий из следующих полей:
//        Вид запроса – перечисление со следующими значениями:
//        WRITEDOWN – списание средств со счета
//        PASSING – зачисление средств на счет
//        BLOCK – блокирование счета
//        UNBLOCK – разблокирование счета