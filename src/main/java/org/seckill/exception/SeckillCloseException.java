package org.seckill.exception;

/**
 * 秒杀已关闭异常
 * Created by jiax on 2016/6/15.
 */
public class SeckillCloseException extends  SeckillException {

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
