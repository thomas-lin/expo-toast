// Copyright 2018-present 650 Industries. All rights reserved.

#import <UnimoduleToast/UnimoduleToastModule.h>

@interface UnimoduleToastModule ()

@property (nonatomic, weak) UMModuleRegistry *moduleRegistry;

@end

@implementation UnimoduleToastModule

UM_EXPORT_MODULE(UnimoduleToast);

- (void)setModuleRegistry:(UMModuleRegistry *)moduleRegistry
{
  _moduleRegistry = moduleRegistry;
}

UM_EXPORT_METHOD_AS(someGreatMethodAsync,
                    options:(NSDictionary *)options
                    resolve:(UMPromiseResolveBlock)resolve
                    reject:(UMPromiseRejectBlock)reject)
{
}

@end
