package com.example.kursspring.components;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
//@Scope("prototype")
//@Scope(value = "session",proxyMode = ScopedProxyMode.TARGET_CLASS) // przechowuje informacje na poziomie calej sesji
@Scope(value = "request",proxyMode = ScopedProxyMode.TARGET_CLASS) //najbardziej dynamiczna , przy przejciu na inna strone - nie obejmuje cofania sie w przegladarce

public class TimeComponent {
    private LocalDateTime time =LocalDateTime.now();

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
