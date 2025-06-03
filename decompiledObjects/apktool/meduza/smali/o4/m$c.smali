.class public final Lo4/m$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo4/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final d:Lo4/m$c;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:Lv5/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv5/b0<",
            "Lv3/i0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lo4/m$c;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v0, v1, v2, v1, v2}, Lo4/m$c;-><init>(JJ)V

    sput-object v0, Lo4/m$c;->d:Lo4/m$c;

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lo4/m$c;->a:J

    iput-wide p3, p0, Lo4/m$c;->b:J

    new-instance p1, Lv5/b0;

    invoke-direct {p1}, Lv5/b0;-><init>()V

    iput-object p1, p0, Lo4/m$c;->c:Lv5/b0;

    return-void
.end method
