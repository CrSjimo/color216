const colorDiff = require("color-diff");
let colors = [
    {
        rgb:{R:0xff,G:0x00,B:0x00},
        zh_cn: "红色",
        en_us: "Red"
    },
    {
        rgb:{R:0xff,G:0x7f,B:0x00},
        zh_cn: "橙色",
        en_us: "Orange"
    },
    {
        rgb:{R:0xff,G:0xff,B:0x00},
        zh_cn: "黄色",
        en_us: "Yellow"
    },
    {
        rgb:{R:0x00,G:0xff,B:0x00},
        zh_cn: "绿色",
        en_us: "Green"
    },
    {
        rgb:{R:0x00,G:0x00,B:0xff},
        zh_cn: "蓝色",
        en_us: "Blue"
    },
    {
        rgb:{R:0xff,G:0x00,B:0xff},
        zh_cn: "紫色",
        en_us: "Purple"
    },
    {
        rgb:{R:0xcc,G:0x33,B:0x66},
        zh_cn: "粉色",
        en_us: "Pink"
    },
]

let white = {
    rgb:{R:255,G:255,B:255},
    zh_cn:"白色",
    en_us:"White",
}

let black = {
    rgb:{R:0,G:0,B:0},
    zh_cn:"黑色",
    en_us:"Black",
}

let gray = {
    rgb:{R:0x7f,G:0x7f,B:0x7f},
    zh_cn:"灰色",
    en_us:"Gray",
}

module.exports = function getColorName(color){
    if(color.R==color.G&&color.R==color.B){
        let num = color.R;
        return num==0?black:num==255?white:gray;
    }
    let result = colorDiff.closest(color,colors.map(a=>a.rgb));
    return colors.find(a=>a.rgb.R==result.R&&a.rgb.G==result.G&&a.rgb.B==result.B);
}