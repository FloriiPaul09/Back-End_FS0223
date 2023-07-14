package com.package;

import javax.persistence;

@Entity
@Table(name = "loans")
public class Loans {
    
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "catalogo_id")
    private Catalogo catalogo;

    @Column(name = "loan_start")
    private LocalDate loanStart;

    @Column(name = "loan_end")
    private LocalDate loanEnd;

    @Column(name = "loan_returned")
    private LocalDate loanReturned;


    //Constructor
    public Loans(){}

    //Start of loan methods
    public LocalDate getLoanStart(){
        return loanStart;
    }

    public void setLoanStart(LocalDate loanStart){
        this.loanStart = loanStart;
    }

    //End of loan methods
    public LocalDate getLoanEnd(){
        return loanEnd;
    }

    public void setLoanEnd(LocalDate loanEnd){
        this.loanEnd = loanEnd;
    }

    //Loan returned methods
    public LocalDate getLoanReturned(){
        return loanReturned;
    }

    public void setLoanReturned(LocalDate loanReturned){
        this.loanReturned = loanReturned;
    }
}
