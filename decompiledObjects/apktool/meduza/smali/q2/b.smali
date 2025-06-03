.class public final Lq2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Ljava/lang/String;


# instance fields
.field public final a:Lp2/t;

.field public final b:Lo2/n;

.field public final c:Lo2/a;

.field public final d:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "DelayedWorkTracker"

    invoke-static {v0}, Lo2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lq2/b;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lp2/t;Lp2/c;Lp2/m0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq2/b;->a:Lp2/t;

    iput-object p2, p0, Lq2/b;->b:Lo2/n;

    iput-object p3, p0, Lq2/b;->c:Lo2/a;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lq2/b;->d:Ljava/util/HashMap;

    return-void
.end method
