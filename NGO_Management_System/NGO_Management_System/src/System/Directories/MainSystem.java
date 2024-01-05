/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Directories;

import Funding.Donation.DonationDirectory;
import Funding.FundManager.FundManagerDirectory;
import Funding.PublicUser.PublicUserDirectory;
import Hospital.Doctor.DoctorDirectory;
import Hospital.Encounter.AppointmentDirectory;
import Hospital.Encounter.EncounterDirectory;

import Hospital.Patient.PatientDirectory;

import JobApp.Applicant.ApplicantDirectory;
import JobApp.Applicant.TeacherApplyDirectory;
import Ngo.Budget.BudgetDirectory;
import Ngo.CareTaker.CaretakerDirectory;
import Ngo.Children.ChildrenDirectory;

import Ngo.NgoManager.NgoManagerDirectory;
import Ngo.Order.NgoOrderDirectory;
import Pharmacy.DeliveryMan.DeliveryManDirectory;
import Pharmacy.Medicine.MedicineDirectory;
import Pharmacy.Order.OrderDirectory;
import Pharmacy.Pharmacist.PharmacistDirectory;
import School.Application.ApplicationDirectory;
import School.FinalResult.FinalResultDirectory;
import School.Principal.PrincipalDirectory;
import School.Student.Student;
import School.Student.StudentDirectory;
import School.Teacher.TeacherDirectory;

/**
 *
 * @author pavanpai
 */
public class MainSystem {
    private static MainSystem data;
    private NgoManagerDirectory ngoManagerList;
    private CaretakerDirectory careTakerList;
    private FundManagerDirectory fundManagerList;
    private PublicUserDirectory publicUserList;
    private EncounterDirectory encounterlist;
    private DoctorDirectory doctorList;
    private PatientDirectory patientList;
    private OrderDirectory orderList;
    private PharmacistDirectory pharmlist;
    private FinalResultDirectory resList;
    private ChildrenDirectory childrenList;
    private TeacherDirectory teacherList;
    private StudentDirectory studentList;
    private ApplicantDirectory applicantList;
    private PrincipalDirectory principalList;
    private ApplicationDirectory applicationList;
    private DeliveryManDirectory deliveryManlist;
    private MedicineDirectory medicineList;
    private DonationDirectory donationList;
    private TeacherApplyDirectory applist;
    private BudgetDirectory budgetList;
    private AppointmentDirectory hosAppList;
    private NgoOrderDirectory ngoOrderList;
    
    public MainSystem(){
        ngoManagerList = new NgoManagerDirectory();
        careTakerList = new CaretakerDirectory();
        fundManagerList = new FundManagerDirectory();
        publicUserList = new PublicUserDirectory();
        pharmlist = new PharmacistDirectory();
        doctorList = new DoctorDirectory();
        patientList = new PatientDirectory();
        orderList = new OrderDirectory();
        encounterlist = new EncounterDirectory();
        resList = new FinalResultDirectory();
        childrenList = new ChildrenDirectory();
        teacherList = new TeacherDirectory();
        studentList = new StudentDirectory();
        applicantList = new ApplicantDirectory();
        principalList = new PrincipalDirectory();
        applicationList = new ApplicationDirectory();
        deliveryManlist = new DeliveryManDirectory();
        medicineList = new MedicineDirectory();
        donationList = new DonationDirectory();
        applist = new TeacherApplyDirectory();
        budgetList = new BudgetDirectory();
        hosAppList = new AppointmentDirectory();
        ngoOrderList = new NgoOrderDirectory();
    }
    
   
    public static MainSystem getInstance()
    {
        if(data == null){
            data = new MainSystem();
        }
        
        return data;
    }

    public NgoManagerDirectory getNgoManagerList() {
        return ngoManagerList;
    }

    public void setNgoManagerList(NgoManagerDirectory ngoManagerList) {
        this.ngoManagerList = ngoManagerList;
    }

    public CaretakerDirectory getCareTakerList() {
        return careTakerList;
    }

    public void setCareTakerList(CaretakerDirectory careTakerList) {
        this.careTakerList = careTakerList;
    }

    public FundManagerDirectory getFundManagerList() {
        return fundManagerList;
    }

    public void setFundManagerList(FundManagerDirectory fundManagerList) {
        this.fundManagerList = fundManagerList;
    }

    public PublicUserDirectory getPublicUserList() {
        return publicUserList;
    }

    public void setPublicUserList(PublicUserDirectory publicUserList) {
        this.publicUserList = publicUserList;
    }

    public DoctorDirectory getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(DoctorDirectory doctorList) {
        this.doctorList = doctorList;
    }

    public PatientDirectory getPatientList() {
        return patientList;
    }

    public void setPatientList(PatientDirectory patientList) {
        this.patientList = patientList;
    }

 
 
    public ChildrenDirectory getChildrenList() {
        return childrenList;
    }

    public void setChildrenList(ChildrenDirectory childrenList) {
        this.childrenList = childrenList;
    }

    public static MainSystem getData() {
        return data;
    }

    public static void setData(MainSystem data) {
        MainSystem.data = data;
    }

    public TeacherDirectory getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(TeacherDirectory teacherList) {
        this.teacherList = teacherList;
    }

    public StudentDirectory getStudentList() {
        return studentList;
    }

    public void setStudentList(StudentDirectory studentList) {
        this.studentList = studentList;
    }

    public ApplicantDirectory getApplicantList() {
        return applicantList;
    }

    public PrincipalDirectory getPrincipalList() {
        return principalList;
    }

    public ApplicationDirectory getApplicationList() {
        return applicationList;
    }

    public EncounterDirectory getEncounterlist() {
        return encounterlist;
    }

    public PharmacistDirectory getPharmlist() {
        return pharmlist;
    }

   

    public MedicineDirectory getMedicineList() {
        return medicineList;
    }

    public DonationDirectory getDonationList() {
        return donationList;
    }

    public void setDonationList(DonationDirectory donationList) {
        this.donationList = donationList;
    }

    public TeacherApplyDirectory getApplist() {
        return applist;
    }

    public FinalResultDirectory getResList() {
        return resList;
    }

    public BudgetDirectory getBudgetList() {
        return budgetList;
    }

    public AppointmentDirectory getHosAppList() {
        return hosAppList;
    }

    public OrderDirectory getOrderList() {
        return orderList;
    }

    public DeliveryManDirectory getDeliveryManlist() {
        return deliveryManlist;
    }

    public NgoOrderDirectory getNgoOrderList() {
        return ngoOrderList;
    }
    
    
    
   
    
    @Override
    public String toString(){
        return "System";
    }
}
