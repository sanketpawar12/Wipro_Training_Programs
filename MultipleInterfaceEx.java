package day5;


interface Printable {
 void printDocument(String document);
 String getStatus(); 
 default void powerOn() { 
     System.out.println("Printable device powering on...");
 }
}
interface Scannable {
 void scanDocument(String document);
 String getStatus(); 
 default void powerOn() { 
     System.out.println("Scannable device powering on...");
 }
}
interface DeviceInfo {
 String getDeviceInfo();
 String getStatus(); 
}


class MultiFunctionDevice implements Printable, Scannable, DeviceInfo {

 private String printerStatus = "Ready to Print";
 private String scannerStatus = "Ready to Scan";
 private String deviceSerialNumber = "MFD-X12345";

 @Override
 public void printDocument(String document) {
     System.out.println("Printing: " + document);
     printerStatus = "Printing in progress...";
 }

 @Override
 public void scanDocument(String document) {
     System.out.println("Scanning: " + document);
     scannerStatus = "Scanning in progress...";
 }

 @Override
 public String getStatus() {
   
     return "Overall Status: Printer (" + printerStatus + "), Scanner (" + scannerStatus + ")";
 }

 @Override
 public String getDeviceInfo() {
     return "Device Type: Multi-Function Printer/Scanner, Serial: " + deviceSerialNumber;
 }

 
 @Override
 public void powerOn() {
     
     Printable.super.powerOn();
     Scannable.super.powerOn(); 
     System.out.println("Multi-Function Device power sequence initiated.");
 }

 public void performSelfTest() {
     System.out.println("Running device self-test...");
     printerStatus = "Self-test OK";
     scannerStatus = "Self-test OK";
 }
}

public class MultipleInterfaceEx {
 public static void main(String[] args) {
     MultiFunctionDevice myDevice = new MultiFunctionDevice();

     System.out.println("--- Device Initialization ---");
     myDevice.powerOn(); 

     System.out.println("\n--- Device Info ---");
     System.out.println(myDevice.getDeviceInfo()); 
     System.out.println(myDevice.getStatus());  

     System.out.println("\n--- Printing Operation ---");
     myDevice.printDocument("Report.pdf"); 
     System.out.println(myDevice.getStatus()); 

     System.out.println("\n--- Scanning Operation ---");
     myDevice.scanDocument("Invoice.jpg");
     System.out.println(myDevice.getStatus()); 

     System.out.println("\n--- Self-Test ---");
     myDevice.performSelfTest();
     System.out.println(myDevice.getStatus());
 }
}
