package com.corejavapractice.JavaPractice.association;

/*
    Composition is a type of association where it is considered to be a strong association
    because the contained object cannot survive without the container object.
    It is because the object is created insdie the class rather than sending it as a reference like we did in Aggregation.

    Basically in Composition, inside the container class, we create the object of the other class
    so when we destroy the container class's object, automatically the contained object also gets destroyed and we can't
    access it.
 */


// 1. The Contained Object (Part)
class HardDrive {
    String data = "OS and User Files";

    public HardDrive() {
        System.out.println("-> HardDrive CREATED.");
    }

    // Finalize is used only for demonstration of GC eligibility
//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("<- HardDrive DESTROYED (Garbage Collected).");
//    }
}


public class Composition {

    // 2. The Container Object (Whole)
    static class PC {
        private String model;
        // ⭐ Composition: The PC exclusively owns the HardDrive.
        private final HardDrive hdd;

        public PC(String model) {
            this.model = model;
            // ⭐ Internal Creation: The PC creates its own component.
            this.hdd = new HardDrive();
            System.out.println("PC " + model + " ASSEMBLED.");
        }

        public void powerOn() {
            System.out.println("PC is running with data: " + hdd.data);
        }

        // NOTE: No getter for the HardDrive, ensuring no external reference exists.
    }

    public static void main(String[] args) {

        System.out.println("--- Starting Composition Demo ---");

        // Create the container object (PC)
        PC officePC = new PC("Model X-2000");
        officePC.powerOn();

        // --- Demonstrating Non-Survivability ---

        System.out.println("\n--- Destroying the Container (PC) ---");

        // ⭐ Making the container object null.
        // The PC object is now unreachable and eligible for GC.
        officePC = null;

        // At this point, the HardDrive object has no active references left:
        // 1. No external reference was ever created.
        // 2. The internal reference (inside 'officePC') is gone because 'officePC' is null.

        // The HardDrive is now guaranteed to be destroyed by the GC
        // because it cannot survive the loss of its container.

        System.out.println("PC reference is null. HardDrive is orphaned and awaiting GC...");

        // Hinting GC to run (purely for rapid demonstration, NOT reliable in production)
        //System.gc();

        System.out.println("\n--- End of Demo ---");
    }
}