.class public final synthetic Lu5/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackInvokedCallback;


# instance fields
.field public final synthetic a:Lu5/i;


# direct methods
.method public synthetic constructor <init>(Lu5/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu5/h;->a:Lu5/i;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onBackInvoked()V
    .locals 1

    .line 1
    iget-object v0, p0, Lu5/h;->a:Lu5/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu5/i;->onBackPressed()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
