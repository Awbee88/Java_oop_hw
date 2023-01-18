package Model;
import java.time.LocalDate;

public class Attendance {
    private LocalDate date;
    private Boolean visited;
    public Attendance(LocalDate date, Boolean visited) {
        this.date = date;
        this.visited = visited;
    }
    public LocalDate getDate() {
        return date;
    }
    public Boolean getVisited() {
        return visited;
    }

    
    
}
