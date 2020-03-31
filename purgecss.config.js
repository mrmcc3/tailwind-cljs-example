module.exports = {
  content: ["src/**/*.cljs"],
  css: ["resources/public/app.css"],
  defaultExtractor: (content) => content.match(/[\w-/.:]+(?<!:)/g) || [],
};
