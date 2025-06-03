.class public final Lp2/q0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp2/q0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Landroid/content/Context;

.field public b:Lw2/a;

.field public c:La3/b;

.field public d:Landroidx/work/a;

.field public e:Landroidx/work/impl/WorkDatabase;

.field public f:Lx2/s;

.field public final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public h:Landroidx/work/WorkerParameters$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/a;La3/b;Lw2/a;Landroidx/work/impl/WorkDatabase;Lx2/s;Ljava/util/ArrayList;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/work/WorkerParameters$a;

    invoke-direct {v0}, Landroidx/work/WorkerParameters$a;-><init>()V

    iput-object v0, p0, Lp2/q0$a;->h:Landroidx/work/WorkerParameters$a;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lp2/q0$a;->a:Landroid/content/Context;

    iput-object p3, p0, Lp2/q0$a;->c:La3/b;

    iput-object p4, p0, Lp2/q0$a;->b:Lw2/a;

    iput-object p2, p0, Lp2/q0$a;->d:Landroidx/work/a;

    iput-object p5, p0, Lp2/q0$a;->e:Landroidx/work/impl/WorkDatabase;

    iput-object p6, p0, Lp2/q0$a;->f:Lx2/s;

    iput-object p7, p0, Lp2/q0$a;->g:Ljava/util/List;

    return-void
.end method
