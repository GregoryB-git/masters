.class public final Luc/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Luc/g$a;

.field public static final b:Ld2/h0;

.field public static final c:Ld2/h0;

.field public static final d:Ld2/h0;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    sget-object v0, Luc/g$a;->a:Luc/g$a;

    sput-object v0, Luc/g;->a:Luc/g$a;

    new-instance v0, Ld2/h0;

    const-string v1, "STATE_REG"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Ld2/h0;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Luc/g;->b:Ld2/h0;

    new-instance v0, Ld2/h0;

    const-string v1, "STATE_COMPLETED"

    invoke-direct {v0, v1, v2}, Ld2/h0;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Luc/g;->c:Ld2/h0;

    new-instance v0, Ld2/h0;

    const-string v1, "STATE_CANCELLED"

    invoke-direct {v0, v1, v2}, Ld2/h0;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Luc/g;->d:Ld2/h0;

    return-void
.end method
