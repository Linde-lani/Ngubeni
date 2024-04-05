

package rc;

import javax.swing.JOptionPane;

public class Learner {
    private String fullName;
    private String subject;
    private double assignmentMark;
    private double testMark;
    private double examMark;

   
    public Learner() {
        this.fullName = "";
        this.subject = "";
        this.assignmentMark = 0.0;
        this.testMark = 0.0;
        this.examMark = 0.0;
    }

    
    public String getFullName() {
        return fullName;
    }

    public String getSubject() {
        return subject;
    }

    public double getAssignmentMark() {
        return assignmentMark;
    }

    public double getTestMark() {
        return testMark;
    }

    public double getExamMark() {
        return examMark;
    }

    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setAssignmentMark(double assignmentMark) {
        this.assignmentMark = assignmentMark;
    }

    public void setTestMark(double testMark) {
        this.testMark = testMark;
    }

    public void setExamMark(double examMark) {
        this.examMark = examMark;
    }

    
    public double calcFinalMark() {
        return (assignmentMark + testMark + examMark) / 3;
    }
}






public class Main {
    public static void main(String[] args) {
        Learner learner = getLearnerInput();
        displayFinalMark(learner);
    }

    public static Learner getLearnerInput() {
        Learner learner = new Learner();
        
        learner.setFullName(JOptionPane.showInputDialog("Enter full name: "));
        learner.setSubject(JOptionPane.showInputDialog("Enter subject: "));
        learner.setAssignmentMark(Double.parseDouble(JOptionPane.showInputDialog("Enter assignment mark: ")));
        learner.setTestMark(Double.parseDouble(JOptionPane.showInputDialog("Enter test mark: ")));
        learner.setExamMark(Double.parseDouble(JOptionPane.showInputDialog("Enter exam mark: ")));

        return learner;
    }

    public static void displayFinalMark(Learner learner) {
        JOptionPane.showMessageDialog(null, "Final Mark: " + learner.calcFinalMark());
    }
}


