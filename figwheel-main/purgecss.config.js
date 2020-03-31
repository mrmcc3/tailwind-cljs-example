module.exports = {
  content: ["src/**/*.cljs"],
  css: ["resources/public/out/app.css"],
  defaultExtractor: (content) => content.match(/[\w-/.:]+(?<!:)/g) || [],
};
