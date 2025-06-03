.class public final Lw5/n$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw5/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/os/Handler;

.field public final b:Lw5/n;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lv3/d0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw5/n$a;->a:Landroid/os/Handler;

    iput-object p2, p0, Lw5/n$a;->b:Lw5/n;

    return-void
.end method
