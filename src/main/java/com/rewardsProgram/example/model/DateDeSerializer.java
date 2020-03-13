package com.rewardsProgram.example.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDeSerializer extends StdDeserializer<Date> {
    protected DateDeSerializer(){
        this(null);
    }

    protected DateDeSerializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        String date = jsonParser.getText();
        System.out.println(date+"   dfgergergerg");
        try{
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-YYYY");
            return simpleDateFormat.parse(date);
        } catch (Exception e ){
            return  null;
        }
    }
}
