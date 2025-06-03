.class public final Lo9/f;
.super Lu7/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo9/f$a;
    }
.end annotation


# static fields
.field public static final synthetic c:I


# instance fields
.field public final a:Lo9/f$a;

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lo9/f$a;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "code"

    invoke-static {p2, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lu7/h;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lo9/f;->a:Lo9/f$a;

    iput-object p3, p0, Lo9/f;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lo9/f$a;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p3}, Lec/i;->b(Ljava/lang/Object;)V

    invoke-direct {p0, p1, p3}, Lu7/h;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-object p2, p0, Lo9/f;->a:Lo9/f$a;

    const/4 p1, 0x0

    iput-object p1, p0, Lo9/f;->b:Ljava/lang/Object;

    return-void
.end method
