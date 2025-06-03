.class public final Ln3/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln3/c$a;
    }
.end annotation


# instance fields
.field public final a:J

.field public final b:Ln3/c$a;


# direct methods
.method public constructor <init>(JLn3/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ln3/c;->a:J

    iput-object p3, p0, Ln3/c;->b:Ln3/c$a;

    return-void
.end method
