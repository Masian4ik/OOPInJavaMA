package com.mainacad.model;

    public class Quadrilateral extends Square {

    private double base;

    public double getBase() { return base; }


        public void setBase(double base) { this.base = base; }

        public Quadrilateral(double side, double base) {
            super(side);
            this.base = base;
        }

        public Quadrilateral(double side) {
            super(side);
        }
    }








