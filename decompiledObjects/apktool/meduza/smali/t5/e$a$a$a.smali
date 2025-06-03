.class public final Lt5/e$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt5/e$a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/os/Handler;

.field public final b:Lt5/e$a;

.field public c:Z


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lw3/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt5/e$a$a$a;->a:Landroid/os/Handler;

    iput-object p2, p0, Lt5/e$a$a$a;->b:Lt5/e$a;

    return-void
.end method
