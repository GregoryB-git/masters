.class public final Lo9/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo9/i$a;
    }
.end annotation


# instance fields
.field public final a:Lo9/i$a;

.field public final b:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Lo9/i$a;)V
    .locals 1

    const-string v0, "functionsFactory"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo9/i;->a:Lo9/i$a;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lo9/i;->b:Ljava/util/HashMap;

    return-void
.end method
