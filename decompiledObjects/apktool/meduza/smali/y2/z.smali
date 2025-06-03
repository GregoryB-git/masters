.class public final Ly2/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# instance fields
.field public final a:La3/b;

.field public final b:Lw2/a;

.field public final c:Lx2/t;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "WMFgUpdater"

    invoke-static {v0}, Lo2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/WorkDatabase;Lw2/a;La3/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ly2/z;->b:Lw2/a;

    iput-object p3, p0, Ly2/z;->a:La3/b;

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->u()Lx2/t;

    move-result-object p1

    iput-object p1, p0, Ly2/z;->c:Lx2/t;

    return-void
.end method
