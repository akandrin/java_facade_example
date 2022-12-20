package com;

// актер
public class Actor {

    String script; // сценарий
    String name;

    public Actor(String name)
    {
        this.name = name;
    }

    public String GetName()
    {
        return name;
    }

    // актер читает сценарий при своем создании
    public void ReadScript(String script)
    {
        this.script = script;
    }

    // играть сцену. Метод возвращает описание того, что играет актер
    public String Act() {
        String result;
        if (script == null || script.isEmpty())
        {
            result = "The actor  can't act because he didn't read the script\n";
        }
        else
        {
            result = "Actor " + "(" + name + ") acts this script:\n" + script + "\n";
        }
        return result;
    }
}
