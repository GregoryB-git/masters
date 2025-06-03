.class public final Lvc/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:I

.field public static final b:Ld2/h0;

.field public static final c:Ld2/h0;

.field public static final d:Ld2/h0;

.field public static final e:Ld2/h0;

.field public static final f:I


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const-string v0, "kotlinx.coroutines.semaphore.maxSpinCycles"

    const/16 v1, 0x64

    const/4 v2, 0x0

    const/16 v3, 0xc

    invoke-static {v0, v1, v2, v2, v3}, Lx6/b;->w0(Ljava/lang/String;IIII)I

    move-result v0

    sput v0, Lvc/j;->a:I

    new-instance v0, Ld2/h0;

    const-string v1, "PERMIT"

    const/16 v4, 0x9

    invoke-direct {v0, v1, v4}, Ld2/h0;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lvc/j;->b:Ld2/h0;

    new-instance v0, Ld2/h0;

    const-string v1, "TAKEN"

    invoke-direct {v0, v1, v4}, Ld2/h0;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lvc/j;->c:Ld2/h0;

    new-instance v0, Ld2/h0;

    const-string v1, "BROKEN"

    invoke-direct {v0, v1, v4}, Ld2/h0;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lvc/j;->d:Ld2/h0;

    new-instance v0, Ld2/h0;

    const-string v1, "CANCELLED"

    invoke-direct {v0, v1, v4}, Ld2/h0;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lvc/j;->e:Ld2/h0;

    const-string v0, "kotlinx.coroutines.semaphore.segmentSize"

    const/16 v1, 0x10

    invoke-static {v0, v1, v2, v2, v3}, Lx6/b;->w0(Ljava/lang/String;IIII)I

    move-result v0

    sput v0, Lvc/j;->f:I

    return-void
.end method
