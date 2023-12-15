package com.github.technus.tectech.loader.recipe;

import gregtech.api.enums.Materials;

/**
 * Created by danie_000 on 16.11.2016.
 */
public class BaseRecipeLoader {

    public static Materials getOrDefault(String name, Materials def) {
        Materials mat = Materials.get(name);
        return mat == Materials._NULL || mat == null ? def : mat;
    }

    public void run() {
        new Assembler().run();
        new AssemblyLine().run();
        new CircuitAssembler().run();
        new Crafting().run();
        new Extractor().run();
        new ResearchStationAssemblyLine().run();
    }
}
