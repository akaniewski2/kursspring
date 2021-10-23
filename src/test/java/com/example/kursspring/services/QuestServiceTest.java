//package com.example.kursspring.services;
//
//import com.example.kursspring.domain.Quest;
//import com.example.kursspring.domain.repository.QuestRepository;
//import org.junit.jupiter.api.Test;
//
//import org.junit.runner.RunWith;
//import org.mockito.Mock;
//import org.mockito.junit.MockitoJUnitRunner;
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
//import static org.hamcrest.Matchers.containsInAnyOrder;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;
//
//@RunWith(MockitoJUnitRunner.class)
//public class QuestServiceTest {
//
//    @Mock
//    QuestRepository repositoryMock;
//    @Test
//    public void returnsNotStartedQuests(){
//
//
//        List<Quest> quests =new ArrayList<>();
//        Quest q1 = new Quest("Test quest 1");
//        Quest q2 = new Quest("Test quest 2");
//        Quest q3 = new Quest("Test quest 3");
//
//        q2.setStarted(true);
//
//        quests.add(q1);
//        quests.add(q2);
//        quests.add(q3);
//
////        for (int i = 0; i < 2; i++) {
////            quests.add(q(i));
////        }
//
//        when(repositoryMock.getAll()).thenReturn(quests);
//
//        QuestService qs = new QuestService();
//        qs.setQuestRepository(repositoryMock);
//        List<Quest> allNotStartedQuests = qs.getAllNotStartedQuests();
//        assertEquals(Float.parseFloat("Size of returned quest"),2,allNotStartedQuests.size());
//     //   assertThat(allNotStartedQuests, containsInAnyOrder(q1,q3)); //nie dziala , tzra jakos zaimportowac conteinsInAnyOrder biblioteka hnkest cos w tym stylu
//
//
//
//    }
//}
