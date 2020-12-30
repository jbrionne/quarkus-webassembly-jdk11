package org.acme.getting.started.wasm;

import org.teavm.interop.Export;

public class WasmFunctions {

	@Export(name = "thePurposeOfLife")
	public static int getThePurposeOfLife() {
		return 42;
	}

	public static void main(String[] args) {

	}
}
