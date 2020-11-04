import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NotepadTest {
  Notepad notepad;

  @BeforeEach
  void setUp() {
    notepad = new Notepad();
  }

  @Test
  void shouldAddNoteToList() {
    // given
    String note = "My first note";

    // when
    notepad.addNote(note);

    // then
    assertThat(notepad.getNotesList()).contains(note).hasSize(1);
  }

  @Test
  void shouldPrintNote() {
    // given
    String note = "My first note";
    // when
    notepad.addNote(note);
    int index = notepad.getNotesList().indexOf(note);
    String actualNote = notepad.printNote(0);
    // then
    assertThat(actualNote).isEqualTo(note);
  }

  @Test
  void shouldGiveCorrectMessagePrintNote() {
    // given
    String message = "Invalid index";
    // when
    String actualMessage = notepad.printNote(0);
    // then
    assertThat(actualMessage).isEqualTo(message);
  }
  @Test
  void shouldGiveStringFromList(){
    // given
    String note1 = "My first note";
    String note2 = "My second note";
    String note3 = "My third note";
    StringBuilder sb = new StringBuilder();
    String list = sb.append(note1).append("\n").append(note2)
        .append("\n").append(note3).toString();
    // when
    notepad.addNote(note1);
    notepad.addNote(note2);
    notepad.addNote(note3);
    String actualList = notepad.list();
    // then
    assertThat(actualList).isEqualTo(list);
  }
  @Test
  void shouldDelete() {
    // given
    String note = "My first note";
    notepad.addNote(note);
    // when
    notepad.delete(0);
    // then
    assertThat(notepad.getNotesList()).isEmpty();
  }

  @Test
  void shouldGiveMessageForIncorrectIndexDelete() {
    // given
    String message = "There is no such index";
    // when
    String actualMessage = notepad.delete(0);
    // then
    assertThat(actualMessage).isEqualTo(message);
  }
}
