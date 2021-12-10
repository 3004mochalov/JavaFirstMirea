package ru.mirea.task3.TaskStep2;

public class Human {
    private String name;
    private HLeg legs=new HLeg();
    private HHead head=new HHead();
    private HHand hands=new HHand();
    private  HBody body=new HBody();
    public Human(String name) {
        this.name = name;
        head.setHealth((int) (Math.random()*100));
        body.setHealth((int) (Math.random()*100));
        legs.setHealth((int) (Math.random()*100));
        hands.setHealth((int) (Math.random()*100));
    }
    public String getName(){return name;}
    public String getStatistic()
    {
        return "Человек по имени: "+getName()+"\n"+"Его/её здоровье:"+"\n"+"Руки: "+hands.getHealth()+"%"+"\n"+"Ноги: "+legs.getHealth()
                +"%"+"\n"+"Голова: "+head.getHealth()+"%"+"\n"+"Тело: "+body.getHealth()+"%";
    }
}
