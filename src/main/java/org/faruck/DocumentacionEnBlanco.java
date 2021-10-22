package org.faruck;


import java.util.*;
public class DocumentacionEnBlanco
{
    private static DocumentacionEnBlanco _instance = null;

    private <Documento> DocumentacionEnBlanco()
    {
        new ArrayList();
    }

    public static DocumentacionEnBlanco Instance()
    {
        if (_instance == null)
            _instance = new DocumentacionEnBlanco();
        return _instance;
    }

}
