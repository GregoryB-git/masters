.class public Lt0/g$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt0/g;->start()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lt0/g;


# direct methods
.method public constructor <init>(Lt0/g;Landroid/os/Looper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt0/g$a;->a:Lt0/g;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/g$a;->a:Lt0/g;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lt0/g;->e(Lt0/g;Landroid/os/Message;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
