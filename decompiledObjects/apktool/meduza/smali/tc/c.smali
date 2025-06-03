.class public final Ltc/c;
.super Ltc/f;
.source "SourceFile"


# static fields
.field public static final d:Ltc/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltc/c;

    invoke-direct {v0}, Ltc/c;-><init>()V

    sput-object v0, Ltc/c;->d:Ltc/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    sget v1, Ltc/j;->c:I

    sget v2, Ltc/j;->d:I

    sget-wide v3, Ltc/j;->e:J

    sget-object v5, Ltc/j;->a:Ljava/lang/String;

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ltc/f;-><init>(IIJLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Dispatchers.Default cannot be closed"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.Default"

    return-object v0
.end method
