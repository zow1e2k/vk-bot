package core.enums;

public enum Buttons {
    TYPE("{\n" +
            "  \"one_time\": true,\n" +
            "  \"buttons\": [\n" +
            "    [{\n" +
            "        \"action\": {\n" +
            "          \"type\": \"text\",\n" +
            "          \"payload\": \"{\\\"button\\\": \\\"1\\\"}\",\n" +
            "          \"label\": \"Внедрение систем\"\n" +
            "        },\n" +
            "        \"color\": \"primary\"\n" +
            "    }],\n" +
            "    [{\n" +
            "        \"action\": {\n" +
            "          \"type\": \"text\",\n" +
            "          \"payload\": \"{\\\"button\\\": \\\"2\\\"}\",\n" +
            "          \"label\": \"Исправление ошибок\"\n" +
            "        },\n" +
            "        \"color\": \"primary\"\n" +
            "    }],\n" +
            "    [{\n" +
            "        \"action\": {\n" +
            "          \"type\": \"text\",\n" +
            "          \"payload\": \"{\\\"button\\\": \\\"3\\\"}\",\n" +
            "          \"label\": \"Создание игрового мода\"\n" +
            "        },\n" +
            "        \"color\": \"primary\"\n" +
            "    }],\n" +
            "    [{\n" +
            "        \"action\": {\n" +
            "          \"type\": \"text\",\n" +
            "          \"payload\": \"{\\\"button\\\": \\\"1\\\"}\",\n" +
            "          \"label\": \"Назад\"\n" +
            "        },\n" +
            "        \"color\": \"positive\"\n" +
            "    }]\n" +
            "  ]\n" +
            "}"),
    PLATFORM("{\n" +
            "  \"one_time\": true,\n" +
            "  \"buttons\": [\n" +
            "    [\n" +
            "      {\n" +
            "        \"action\": {\n" +
            "          \"type\": \"text\",\n" +
            "          \"payload\": \"{\\\"button\\\": \\\"1\\\"}\",\n" +
            "          \"label\": \"SAMP\"\n" +
            "        },\n" +
            "        \"color\": \"primary\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"action\": {\n" +
            "          \"type\": \"text\",\n" +
            "          \"payload\": \"{\\\"button\\\": \\\"2\\\"}\",\n" +
            "          \"label\": \"CRMP\"\n" +
            "        },\n" +
            "        \"color\": \"primary\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"action\": {\n" +
            "          \"type\": \"text\",\n" +
            "          \"payload\": \"{\\\"button\\\": \\\"1\\\"}\",\n" +
            "          \"label\": \"RAGE MP\"\n" +
            "        },\n" +
            "        \"color\": \"primary\"\n" +
            "      }\n" +
            "    ],\n" +
            "    [{\n" +
            "        \"action\": {\n" +
            "          \"type\": \"text\",\n" +
            "          \"payload\": \"{\\\"button\\\": \\\"1\\\"}\",\n" +
            "          \"label\": \"Назад\"\n" +
            "        },\n" +
            "        \"color\": \"positive\"\n" +
            "    }]\n" +
            "  ]\n" +
            "}"),
    PLATFORM_MAP("{\n" +
            "  \"one_time\": true,\n" +
            "  \"buttons\": [\n" +
            "    [\n" +
            "      {\n" +
            "        \"action\": {\n" +
            "          \"type\": \"text\",\n" +
            "          \"payload\": \"{\\\"button\\\": \\\"1\\\"}\",\n" +
            "          \"label\": \"SAMP/CRMP\"\n" +
            "        },\n" +
            "        \"color\": \"primary\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"action\": {\n" +
            "          \"type\": \"text\",\n" +
            "          \"payload\": \"{\\\"button\\\": \\\"1\\\"}\",\n" +
            "          \"label\": \"RAGEMP\"\n" +
            "        },\n" +
            "        \"color\": \"primary\"\n" +
            "      }\n" +
            "    ],\n" +
            "    [{\n" +
            "        \"action\": {\n" +
            "          \"type\": \"text\",\n" +
            "          \"payload\": \"{\\\"button\\\": \\\"1\\\"}\",\n" +
            "          \"label\": \"Назад\"\n" +
            "        },\n" +
            "        \"color\": \"positive\"\n" +
            "    }]\n" +
            "  ]\n" +
            "}"),
    PLATFORM_WEB("{\n" +
            "  \"one_time\": true,\n" +
            "  \"buttons\": [\n" +
            "    [{\n" +
            "        \"action\": {\n" +
            "          \"type\": \"text\",\n" +
            "          \"payload\": \"{\\\"button\\\": \\\"1\\\"}\",\n" +
            "          \"label\": \"Стандарт клиент-сервер\"\n" +
            "        },\n" +
            "        \"color\": \"primary\"\n" +
            "    }],\n" +
            "    [{\n" +
            "        \"action\": {\n" +
            "          \"type\": \"text\",\n" +
            "          \"payload\": \"{\\\"button\\\": \\\"2\\\"}\",\n" +
            "          \"label\": \"Single Page Application\"\n" +
            "        },\n" +
            "        \"color\": \"primary\"\n" +
            "    }],\n" +
            "    [{\n" +
            "        \"action\": {\n" +
            "          \"type\": \"text\",\n" +
            "          \"payload\": \"{\\\"button\\\": \\\"1\\\"}\",\n" +
            "          \"label\": \"Назад\"\n" +
            "        },\n" +
            "        \"color\": \"positive\"\n" +
            "    }]\n" +
            "  ]\n" +
            "}"),
    PLATFORM_DESIGN("{\n" +
            "  \"one_time\": true,\n" +
            "  \"buttons\": [\n" +
            "    [{\n" +
            "        \"action\": {\n" +
            "          \"type\": \"text\",\n" +
            "          \"payload\": \"{\\\"button\\\": \\\"1\\\"}\",\n" +
            "          \"label\": \"UI/UX\"\n" +
            "        },\n" +
            "        \"color\": \"primary\"\n" +
            "    }],\n" +
            "    [{\n" +
            "        \"action\": {\n" +
            "          \"type\": \"text\",\n" +
            "          \"payload\": \"{\\\"button\\\": \\\"2\\\"}\",\n" +
            "          \"label\": \"Web\"\n" +
            "        },\n" +
            "        \"color\": \"primary\"\n" +
            "    }],\n" +
            "    [{\n" +
            "        \"action\": {\n" +
            "          \"type\": \"text\",\n" +
            "          \"payload\": \"{\\\"button\\\": \\\"3\\\"}\",\n" +
            "          \"label\": \"Motion\"\n" +
            "        },\n" +
            "        \"color\": \"primary\"\n" +
            "    }],\n" +
            "    [{\n" +
            "        \"action\": {\n" +
            "          \"type\": \"text\",\n" +
            "          \"payload\": \"{\\\"button\\\": \\\"4\\\"}\",\n" +
            "          \"label\": \"Illustration\"\n" +
            "        },\n" +
            "        \"color\": \"primary\"\n" +
            "    }],\n" +
            "    [{\n" +
            "        \"action\": {\n" +
            "          \"type\": \"text\",\n" +
            "          \"payload\": \"{\\\"button\\\": \\\"1\\\"}\",\n" +
            "          \"label\": \"Назад\"\n" +
            "        },\n" +
            "        \"color\": \"positive\"\n" +
            "    }]\n" +
            "  ]\n" +
            "}"),
    TYPE_MAP("{\n" +
            "  \"one_time\": true,\n" +
            "  \"buttons\": [\n" +
            "    [{\n" +
            "        \"action\": {\n" +
            "          \"type\": \"text\",\n" +
            "          \"payload\": \"{\\\"button\\\": \\\"1\\\"}\",\n" +
            "          \"label\": \"Маппинг с нуля\"\n" +
            "        },\n" +
            "        \"color\": \"primary\"\n" +
            "    }],\n" +
            "    [{\n" +
            "        \"action\": {\n" +
            "          \"type\": \"text\",\n" +
            "          \"payload\": \"{\\\"button\\\": \\\"2\\\"}\",\n" +
            "          \"label\": \"Внедрение маппинга\"\n" +
            "        },\n" +
            "        \"color\": \"primary\"\n" +
            "    }],\n" +
            "    [{\n" +
            "        \"action\": {\n" +
            "          \"type\": \"text\",\n" +
            "          \"payload\": \"{\\\"button\\\": \\\"1\\\"}\",\n" +
            "          \"label\": \"Назад\"\n" +
            "        },\n" +
            "        \"color\": \"positive\"\n" +
            "    }]\n" +
            "  ]\n" +
            "}"),
    TYPE_WEB("{\n" +
            "  \"one_time\": true,\n" +
            "  \"buttons\": [\n" +
            "    [{\n" +
            "        \"action\": {\n" +
            "          \"type\": \"text\",\n" +
            "          \"payload\": \"{\\\"button\\\": \\\"1\\\"}\",\n" +
            "          \"label\": \"Создание сайта\"\n" +
            "        },\n" +
            "        \"color\": \"primary\"\n" +
            "    }],\n" +
            "    [{\n" +
            "        \"action\": {\n" +
            "          \"type\": \"text\",\n" +
            "          \"payload\": \"{\\\"button\\\": \\\"2\\\"}\",\n" +
            "          \"label\": \"Исправление веб-ошибок\"\n" +
            "        },\n" +
            "        \"color\": \"primary\"\n" +
            "    }],\n" +
            "    [{\n" +
            "        \"action\": {\n" +
            "          \"type\": \"text\",\n" +
            "          \"payload\": \"{\\\"button\\\": \\\"2\\\"}\",\n" +
            "          \"label\": \"Изменение контента\"\n" +
            "        },\n" +
            "        \"color\": \"primary\"\n" +
            "    }],\n" +
            "    [{\n" +
            "        \"action\": {\n" +
            "          \"type\": \"text\",\n" +
            "          \"payload\": \"{\\\"button\\\": \\\"1\\\"}\",\n" +
            "          \"label\": \"Назад\"\n" +
            "        },\n" +
            "        \"color\": \"positive\"\n" +
            "    }]\n" +
            "  ]\n" +
            "}"),
    START("{\n" +
            "  \"one_time\": true,\n" +
            "  \"buttons\": [\n" +
            "    [{\n" +
            "        \"action\": {\n" +
            "          \"type\": \"text\",\n" +
            "          \"payload\": \"{\\\"button\\\": \\\"1\\\"}\",\n" +
            "          \"label\": \"Получить Platinum VIP\"\n" +
            "        },\n" +
            "        \"color\": \"positive\"\n" +
            "    }],\n" +
            "    [{\n" +
            "        \"action\": {\n" +
            "          \"type\": \"text\",\n" +
            "          \"payload\": \"{\\\"button\\\": \\\"4\\\"}\",\n" +
            "          \"label\": \"Акции\"\n" +
            "        },\n" +
            "        \"color\": \"primary\"\n" +
            "    }]\n" +
            "  ]\n" +
            "}"),
    RETURN("{\n" +
                  "  \"one_time\": true,\n" +
                  "  \"buttons\": [\n" +
                  "    [{\n" +
                  "        \"action\": {\n" +
                  "          \"type\": \"text\",\n" +
                  "          \"payload\": \"{\\\"button\\\": \\\"1\\\"}\",\n" +
                  "          \"label\": \"Назад\"\n" +
                  "        },\n" +
                  "        \"color\": \"positive\"\n" +
                  "    }]\n" +
                  "  ]\n" +
                  "}"),
    ACTIVITY("{\n" +
            "  \"one_time\": true,\n" +
            "  \"buttons\": [\n" +
            "    [{\n" +
            "        \"action\": {\n" +
            "          \"type\": \"text\",\n" +
            "          \"payload\": \"{\\\"button\\\": \\\"1\\\"}\",\n" +
            "          \"label\": \"Скриптинг\"\n" +
            "        },\n" +
            "        \"color\": \"primary\"\n" +
            "    }],\n" +
            "    [{\n" +
            "        \"action\": {\n" +
            "          \"type\": \"text\",\n" +
            "          \"payload\": \"{\\\"button\\\": \\\"2\\\"}\",\n" +
            "          \"label\": \"Маппинг\"\n" +
            "        },\n" +
            "        \"color\": \"primary\"\n" +
            "    }],\n" +
            "    [{\n" +
            "        \"action\": {\n" +
            "          \"type\": \"text\",\n" +
            "          \"payload\": \"{\\\"button\\\": \\\"3\\\"}\",\n" +
            "          \"label\": \"Web-разработка\"\n" +
            "        },\n" +
            "        \"color\": \"primary\"\n" +
            "    }],\n" +
            "    [{\n" +
            "        \"action\": {\n" +
            "          \"type\": \"text\",\n" +
            "          \"payload\": \"{\\\"button\\\": \\\"4\\\"}\",\n" +
            "          \"label\": \"Дизайн\"\n" +
            "        },\n" +
            "        \"color\": \"primary\"\n" +
            "    }],\n" +
            "    [{\n" +
            "        \"action\": {\n" +
            "          \"type\": \"text\",\n" +
            "          \"payload\": \"{\\\"button\\\": \\\"1\\\"}\",\n" +
            "          \"label\": \"Назад\"\n" +
            "        },\n" +
            "        \"color\": \"positive\"\n" +
            "    }]\n" +
            "  ]\n" +
            "}");
    private String obj;
    Buttons(String obj){
        this.obj = obj;
    }
    public String getObj(){
        return this.obj;
    }
}
