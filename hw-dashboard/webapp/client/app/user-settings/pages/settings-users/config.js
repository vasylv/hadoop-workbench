define(function (require) {
    "use strict";

    var $ = require('jquery');
    var ng = require('angular');
    require('./ngModule').config(config);

    config.$inject = ['dap-widget.$widgetProvider', 'dap.core.config'];
    function config($widgetProvider, dapConfig) {
        $widgetProvider.widget('user-settings.pages.users-settings-properties', {
            templateUrl: dapConfig.pathToApp + '/user-settings/pages/settings-users/views/index.html',
            controller: 'userSettings.pages.SettingsUsersPageController'
        });
    }
});
