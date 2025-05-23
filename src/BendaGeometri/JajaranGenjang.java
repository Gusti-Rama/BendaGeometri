package BendaGeometri;

import java.io.*;
import java.util.*;

public class JajaranGenjang extends Benda2D {

	private double alas;
	private double tinggi;
	private double sisiMiring;

	public JajaranGenjang() {
		this.alas = 0;
		this.tinggi = 0;
		this.sisiMiring = 0;
	}

	public JajaranGenjang(double alas, double tinggi, double sisiMiring) {
		this.alas = alas;
		this.tinggi = tinggi;
		this.sisiMiring = sisiMiring;
	}

	public JajaranGenjang(int alas, int tinggi, int sisiMiring) {
		this.alas = alas;
		this.tinggi = tinggi;
		this.sisiMiring = sisiMiring;
	}

	public void cetakAlas() {
		System.out.println("Alas: " + this.alas);
	}

	public void cetakTinggi() {
		System.out.println("Tinggi: " + this.tinggi);
	}

	public void cetakSisiMiring() {
		System.out.println("Sisi Miring: " + this.sisiMiring);
	}

	public void aturAlas(double alas) {
		this.alas = alas;
	}

	public void aturAlas(int alas) {
		this.alas = alas;
	}

	public void aturTinggi(double tinggi) {
		this.tinggi = tinggi;
	}

	public void aturTinggi(int tinggi) {
		this.tinggi = tinggi;
	}

	public void aturSisiMiring(double sisiMiring) {
		this.sisiMiring = sisiMiring;
	}

	public void aturSisiMiring(int sisiMiring) {
		this.sisiMiring = sisiMiring;
	}


	public double getAlas() {
		return alas;
	}

	public double getTinggi() {
		return tinggi;
	}

	public double getSisiMiring() {
		return sisiMiring;
	}

	@Override
	public float menghitungLuas() {
		return (float) (2 * (this.alas + this.sisiMiring));
	}

	@Override
	public double menghitungLuas(double[] params) {
		if (params.length >= 2) {
			return params[0] * params[1];
		}
		return 0.0;
	}

	@Override
	public double menghitungLuas(int[] params) {
		if (params.length >= 2) {
			return params[0] * params[1];
		}
		return 0.0;
	}

	@Override
	public float menghitungKeliling() {
		return (float) (2 * (this.alas + this.sisiMiring));
	}

	@Override
	public double menghitungKeliling(double[] params) {
		if (params.length >= 2) {
			return 2 * (params[0] + params[1]);
		}
		return 0.0;
	}

	@Override
	public double menghitungKeliling(int[] params) {
		if (params.length >= 2) {
			return 2 * (params[0] + params[1]);
		}
		return 0.0;
	}

	@Override
	public void mencetakLuas() {
		System.out.println("Luas Jajaran Genjang: " + menghitungLuas());
	}

	@Override
	public void mencetakKeliling() {
		System.out.println("Keliling Jajaran Genjang: " + menghitungKeliling());
	}
}
