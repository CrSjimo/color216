const gm = require("gm");

const getModelOf = id=>({
    concrete: {
        parent: "block/cube_all",
        textures: {
            all: `color216:block/${id}`
        }
    },
    concrete_slab: {
        parent: "block/slab",
        textures: {
            bottom: `color216:block/${id}`,
            top: `color216:block/${id}`,
            side: `color216:block/${id}`
        }
    },
    concrete_slab_top: {
        parent: "block/slab_top",
        textures: {
            bottom: `color216:block/${id}`,
            top: `color216:block/${id}`,
            side: `color216:block/${id}`
        }
    },
    concrete_stairs: {
        "parent": "block/stairs",
        "textures": {
            "bottom": `color216:block/${id}`,
            "top": `color216:block/${id}`,
            "side": `color216:block/${id}`
        }
    },
    concrete_stair_inner: {
        "parent": "block/inner_stairs",
        "textures": {
            "bottom": `color216:block/${id}`,
            "top": `color216:block/${id}`,
            "side": `color216:block/${id}`
        }
    },
    concrete_stair_outer: {
        "parent": "block/outer_stairs",
        "textures": {
            "bottom": `color216:block/${id}`,
            "top": `color216:block/${id}`,
            "side": `color216:block/${id}`
        }
    }
})

const getItemModelOf = idFull=>({
    parent: `color216:block/${idFull}`
});

const getBlockstateOf = id=>({
    concrete: {
        variants: {
            "": { model: `color216:block/${id}_concrete` }
        }
    },
    concrete_slab: {
        variants: {
            "type=bottom": { model: `color216:block/${id}_concrete_slab` },
            "type=top": { model: `color216:block/${id}_concrete_slab_top` },
            "type=double": { model: `color216:block/${id}_concrete` }
        }
    },
    concrete_stairs: {
        "variants": {
            "facing=east,half=bottom,shape=straight":  { "model": `color216:block/${id}_concrete_stair` },
            "facing=west,half=bottom,shape=straight":  { "model": `color216:block/${id}_concrete_stair`, "y": 180, "uvlock": true },
            "facing=south,half=bottom,shape=straight": { "model": `color216:block/${id}_concrete_stair`, "y": 90, "uvlock": true },
            "facing=north,half=bottom,shape=straight": { "model": `color216:block/${id}_concrete_stair`, "y": 270, "uvlock": true },
            "facing=east,half=bottom,shape=outer_right":  { "model": `color216:block/${id}_concrete_stair_outer` },
            "facing=west,half=bottom,shape=outer_right":  { "model": `color216:block/${id}_concrete_stair_outer`, "y": 180, "uvlock": true },
            "facing=south,half=bottom,shape=outer_right": { "model": `color216:block/${id}_concrete_stair_outer`, "y": 90, "uvlock": true },
            "facing=north,half=bottom,shape=outer_right": { "model": `color216:block/${id}_concrete_stair_outer`, "y": 270, "uvlock": true },
            "facing=east,half=bottom,shape=outer_left":  { "model": `color216:block/${id}_concrete_stair_outer`, "y": 270, "uvlock": true },
            "facing=west,half=bottom,shape=outer_left":  { "model": `color216:block/${id}_concrete_stair_outer`, "y": 90, "uvlock": true },
            "facing=south,half=bottom,shape=outer_left": { "model": `color216:block/${id}_concrete_stair_outer` },
            "facing=north,half=bottom,shape=outer_left": { "model": `color216:block/${id}_concrete_stair_outer`, "y": 180, "uvlock": true },
            "facing=east,half=bottom,shape=inner_right":  { "model": `color216:block/${id}_concrete_stair_inner` },
            "facing=west,half=bottom,shape=inner_right":  { "model": `color216:block/${id}_concrete_stair_inner`, "y": 180, "uvlock": true },
            "facing=south,half=bottom,shape=inner_right": { "model": `color216:block/${id}_concrete_stair_inner`, "y": 90, "uvlock": true },
            "facing=north,half=bottom,shape=inner_right": { "model": `color216:block/${id}_concrete_stair_inner`, "y": 270, "uvlock": true },
            "facing=east,half=bottom,shape=inner_left":  { "model": `color216:block/${id}_concrete_stair_inner`, "y": 270, "uvlock": true },
            "facing=west,half=bottom,shape=inner_left":  { "model": `color216:block/${id}_concrete_stair_inner`, "y": 90, "uvlock": true },
            "facing=south,half=bottom,shape=inner_left": { "model": `color216:block/${id}_concrete_stair_inner` },
            "facing=north,half=bottom,shape=inner_left": { "model": `color216:block/${id}_concrete_stair_inner`, "y": 180, "uvlock": true },
            "facing=east,half=top,shape=straight":  { "model": `color216:block/${id}_concrete_stair`, "x": 180, "uvlock": true },
            "facing=west,half=top,shape=straight":  { "model": `color216:block/${id}_concrete_stair`, "x": 180, "y": 180, "uvlock": true },
            "facing=south,half=top,shape=straight": { "model": `color216:block/${id}_concrete_stair`, "x": 180, "y": 90, "uvlock": true },
            "facing=north,half=top,shape=straight": { "model": `color216:block/${id}_concrete_stair`, "x": 180, "y": 270, "uvlock": true },
            "facing=east,half=top,shape=outer_right":  { "model": `color216:block/${id}_concrete_stair_outer`, "x": 180, "y": 90, "uvlock": true },
            "facing=west,half=top,shape=outer_right":  { "model": `color216:block/${id}_concrete_stair_outer`, "x": 180, "y": 270, "uvlock": true },
            "facing=south,half=top,shape=outer_right": { "model": `color216:block/${id}_concrete_stair_outer`, "x": 180, "y": 180, "uvlock": true },
            "facing=north,half=top,shape=outer_right": { "model": `color216:block/${id}_concrete_stair_outer`, "x": 180, "uvlock": true },
            "facing=east,half=top,shape=outer_left":  { "model": `color216:block/${id}_concrete_stair_outer`, "x": 180, "uvlock": true },
            "facing=west,half=top,shape=outer_left":  { "model": `color216:block/${id}_concrete_stair_outer`, "x": 180, "y": 180, "uvlock": true },
            "facing=south,half=top,shape=outer_left": { "model": `color216:block/${id}_concrete_stair_outer`, "x": 180, "y": 90, "uvlock": true },
            "facing=north,half=top,shape=outer_left": { "model": `color216:block/${id}_concrete_stair_outer`, "x": 180, "y": 270, "uvlock": true },
            "facing=east,half=top,shape=inner_right":  { "model": `color216:block/${id}_concrete_stair_inner`, "x": 180, "y": 90, "uvlock": true },
            "facing=west,half=top,shape=inner_right":  { "model": `color216:block/${id}_concrete_stair_inner`, "x": 180, "y": 270, "uvlock": true },
            "facing=south,half=top,shape=inner_right": { "model": `color216:block/${id}_concrete_stair_inner`, "x": 180, "y": 180, "uvlock": true },
            "facing=north,half=top,shape=inner_right": { "model": `color216:block/${id}_concrete_stair_inner`, "x": 180, "uvlock": true },
            "facing=east,half=top,shape=inner_left":  { "model": `color216:block/${id}_concrete_stair_inner`, "x": 180, "uvlock": true },
            "facing=west,half=top,shape=inner_left":  { "model": `color216:block/${id}_concrete_stair_inner`, "x": 180, "y": 180, "uvlock": true },
            "facing=south,half=top,shape=inner_left": { "model": `color216:block/${id}_concrete_stair_inner`, "x": 180, "y": 90, "uvlock": true },
            "facing=north,half=top,shape=inner_left": { "model": `color216:block/${id}_concrete_stair_inner`, "x": 180, "y": 270, "uvlock": true }
        }
    }
})

const colorProfiles = require("./colorProfiles");

const path = require("path");

const fs = require("fs");

const opt = process.argv[2];

let noModel = false,
    noBlockstate = false,
    noTexture = false,
    noInit = false
    noLang = false;

if(opt[0]=='-'){
    if(opt.includes('m'))noModel = true;
    if(opt.includes('b'))noBlockstate = true;
    if(opt.includes('t'))noTexture = true;
    if(opt.includes('i'))noInit = true;
    if(opt.includes('l'))noLang = true;
}

const assetsPath = path.join("./","src","main","resources","assets","color216");
let initBlockEnums = [];
let langEN_US = {};
let langZH_CN = {};
for(let colorProfile of colorProfiles){
    if(!noTexture){
        gm(16,16,colorProfile.rgbHex).write(path.join(assetsPath,"textures","block",`${colorProfile.id}.png`),(err)=>{if(err)throw err});
    }
    if(!noModel)for(let modelType of Object.keys(getModelOf("114514"))){
        fs.writeFileSync(path.join(assetsPath,"models","block",`${colorProfile.id}_${modelType}.json`),JSON.stringify(getModelOf(colorProfile.id)[modelType]));
    }
    if(!noBlockstate)for(let blockstateType of Object.keys(getBlockstateOf("114514"))){
        fs.writeFileSync(path.join(assetsPath,"blockstates",`${colorProfile.id}_${blockstateType}.json`),JSON.stringify(getBlockstateOf(colorProfile.id)[blockstateType]));
        fs.writeFileSync(path.join(assetsPath,"models","item",`${colorProfile.id}_${blockstateType}.json`),JSON.stringify(getItemModelOf(`${colorProfile.id}_${blockstateType}`)));
    }
    if(!noLang)for(let blockstateType of Object.keys(getBlockstateOf("114514"))){
        langEN_US[`block.color216.${colorProfile.id}_${blockstateType}`] = colorProfile.en_us;
        langZH_CN[`block.color216.${colorProfile.id}_${blockstateType}`] = colorProfile.zh_cn;
    }
    if(!noInit)initBlockEnums.push(`${colorProfile.id.toUpperCase()}("${colorProfile.id}")`);
}
if(!noLang){
    langEN_US['itemGroup.color216.color216'] = langZH_CN['itemGroup.color216.color216'] = "Color 216";
    fs.writeFileSync(path.join(assetsPath,'lang','en_us.json'),JSON.stringify(langEN_US));
    fs.writeFileSync(path.join(assetsPath,'lang','zh_cn.json'),JSON.stringify(langZH_CN));
}
if(!noInit)fs.writeFileSync("./tmp",initBlockEnums.join(",\n")+";\n");