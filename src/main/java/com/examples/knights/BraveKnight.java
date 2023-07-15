package com.examples.knights;


import com.examples.quests.Quest;
import org.springframework.stereotype.Component;

@Component("knight")
public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
