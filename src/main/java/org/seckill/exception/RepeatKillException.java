package org.seckill.exception;

/**
 * 重复秒杀异常(运行时异常)
 * Created by jiax on 2016/6/15.
 */
public class RepeatKillException extends SeckillException {

    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }

}
