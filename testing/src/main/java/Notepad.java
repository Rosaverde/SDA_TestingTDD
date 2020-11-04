import java.util.ArrayList;
import java.util.List;

public class Notepad {

  private List<String> notesList = new ArrayList<>();

  public Notepad() {}

  public List<String> getNotesList() {
    return notesList;
  }

  public void addNote(String note) {
    notesList.add(note);
  }

  public String printNote(int index) {
    if (index > notesList.size() || notesList.isEmpty()) {
      return "Invalid index";
    } else return notesList.get(index);
  }

  public String list() {
    StringBuilder sb = new StringBuilder();
    for (String note : notesList) {
      sb.append(note);
      if (!note.equals(notesList.get(notesList.size() - 1))) {
        sb.append("\n");
      }
    }
    return sb.toString();
  }

  public String delete(int index) {
    if (index >= notesList.size()) {
      return "There is no such index";
    } else {
      notesList.remove(index);
      return "Deleted";
    }
  }
}
