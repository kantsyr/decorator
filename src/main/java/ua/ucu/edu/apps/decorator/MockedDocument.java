package ua.ucu.edu.apps.decorator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MockedDocument implements Document{
    public String gcsPath;
    
    @Override
    public String parse(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "Document Mocked";
    }
}
