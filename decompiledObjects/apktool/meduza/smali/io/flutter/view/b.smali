.class public final synthetic Lio/flutter/view/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/util/Predicate;


# instance fields
.field public final synthetic a:Lio/flutter/view/AccessibilityBridge$SemanticsNode;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/view/AccessibilityBridge$SemanticsNode;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/view/b;->a:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lio/flutter/view/b;->a:Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    check-cast p1, Lio/flutter/view/AccessibilityBridge$SemanticsNode;

    invoke-static {v0, p1}, Lio/flutter/view/AccessibilityBridge;->b(Lio/flutter/view/AccessibilityBridge$SemanticsNode;Lio/flutter/view/AccessibilityBridge$SemanticsNode;)Z

    move-result p1

    return p1
.end method
