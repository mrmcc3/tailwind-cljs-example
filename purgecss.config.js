module.exports = {
  content: ["src/**/*.cljs"],
  css: ["public/app.css"],
  defaultExtractor: (content) => content.match(/[\w-/.:]+(?<!:)/g) || [],
};
