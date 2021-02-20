const webColorList = require("./webColorList");
const getColorName = require("./getColorName");

module.exports = webColorList.map(color=>{
    let closestColor = getColorName(color);
    let colorHex = `${color.R.toString(16)[0]}${color.G.toString(16)[0]}${color.B.toString(16)[0]}`;
    return {
        id: `${closestColor.en_us.toLowerCase()}_${colorHex}`,
        en_us: `${closestColor.en_us} (${colorHex.toUpperCase()})`,
        zh_cn: `${closestColor.zh_cn}（${colorHex.toUpperCase()}）`,
        rgbHex: '#'+colorHex.split("").map(x=>x+x).join(''),
    }
});