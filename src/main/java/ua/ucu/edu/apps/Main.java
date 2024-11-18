package ua.ucu.edu.apps;

import ua.ucu.edu.apps.decorator.CachedDocument;
import ua.ucu.edu.apps.decorator.MockedDocument;
import ua.ucu.edu.apps.decorator.TimedDocument;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        MockedDocument mockedDocument = new MockedDocument("path");

        TimedDocument timedDocument
                = new TimedDocument(mockedDocument);

        System.out.println(timedDocument.parse());

        CachedDocument cachedDocument = new CachedDocument(mockedDocument);
        cachedDocument.parse();

    }
}