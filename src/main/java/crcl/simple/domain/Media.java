package crcl.simple.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
public class Media {
    @Id
    private String id;
    private String fileName;
    private MediaType mediaType;

    @RequiredArgsConstructor
    public enum MediaType {
        VIDEO("video"),
        IMAGE("image"),
        AUDIO("audio"),
        DOCUMENT("document"),
        OTHER("other");

        private final String type;

    }
}
