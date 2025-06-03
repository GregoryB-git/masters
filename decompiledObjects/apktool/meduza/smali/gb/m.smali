.class public final Lgb/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lgb/o3;

.field public final b:Lgb/q1;

.field public final c:Lgb/q1;

.field public final d:Lgb/q1;


# direct methods
.method public constructor <init>(Lgb/o3;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lx6/b;->O()Lgb/q1;

    move-result-object v0

    iput-object v0, p0, Lgb/m;->b:Lgb/q1;

    invoke-static {}, Lx6/b;->O()Lgb/q1;

    move-result-object v0

    iput-object v0, p0, Lgb/m;->c:Lgb/q1;

    invoke-static {}, Lx6/b;->O()Lgb/q1;

    move-result-object v0

    iput-object v0, p0, Lgb/m;->d:Lgb/q1;

    iput-object p1, p0, Lgb/m;->a:Lgb/o3;

    return-void
.end method
