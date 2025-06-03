.class public final Lgb/r3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgb/r3$a;
    }
.end annotation


# static fields
.field public static final c:Lgb/r3$a;


# instance fields
.field public final a:Lgb/o3;

.field public final b:Lgb/q1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgb/r3$a;

    invoke-direct {v0}, Lgb/r3$a;-><init>()V

    sput-object v0, Lgb/r3;->c:Lgb/r3$a;

    return-void
.end method

.method public constructor <init>(Lgb/o3;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lx6/b;->O()Lgb/q1;

    move-result-object v0

    iput-object v0, p0, Lgb/r3;->b:Lgb/q1;

    iput-object p1, p0, Lgb/r3;->a:Lgb/o3;

    return-void
.end method
