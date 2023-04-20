package ru.netology.sender;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

import java.util.Map;

public interface MessageSender {

    String send(Map<String, String> headers);
}
