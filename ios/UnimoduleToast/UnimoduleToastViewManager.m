// Copyright 2016-present 650 Industries. All rights reserved.

#import <UnimoduleToast/UnimoduleToastView.h>
#import <UnimoduleToast/UnimoduleToastViewManager.h>

@interface UnimoduleToastViewManager ()

@property (nonatomic, weak) UMModuleRegistry *moduleRegistry;

@end

@implementation UnimoduleToastViewManager

UM_EXPORT_MODULE(UnimoduleToastViewManager);

- (UIView *)view
{
  return [[UnimoduleToastView alloc] initWithModuleRegistry:_moduleRegistry];
}

- (NSString *)viewName
{
  return @"UnimoduleToastView";
}

- (NSArray<NSString *> *)supportedEvents
{
  return @[@"onSomethingHappened"];
}

- (void)setModuleRegistry:(UMModuleRegistry *)moduleRegistry
{
  _moduleRegistry = moduleRegistry;
}

@end
