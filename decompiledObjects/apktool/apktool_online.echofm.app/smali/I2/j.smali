.class public final LI2/j;
.super LM2/a;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    .line 1
    const-string v0, "com.google.android.gms.dynamite.IDynamiteLoader"

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, LM2/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final Z0(LH2/a;Ljava/lang/String;Z)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LM2/a;->o()Landroid/os/Parcel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, LM2/c;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, p3}, LM2/c;->c(Landroid/os/Parcel;Z)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x3

    .line 15
    invoke-virtual {p0, p1, v0}, LM2/a;->n(ILandroid/os/Parcel;)Landroid/os/Parcel;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    .line 24
    .line 25
    .line 26
    return p2
.end method

.method public final a1(LH2/a;Ljava/lang/String;Z)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LM2/a;->o()Landroid/os/Parcel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, LM2/c;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, p3}, LM2/c;->c(Landroid/os/Parcel;Z)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x5

    .line 15
    invoke-virtual {p0, p1, v0}, LM2/a;->n(ILandroid/os/Parcel;)Landroid/os/Parcel;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    .line 24
    .line 25
    .line 26
    return p2
.end method

.method public final b1(LH2/a;Ljava/lang/String;I)LH2/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, LM2/a;->o()Landroid/os/Parcel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, LM2/c;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeInt(I)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    invoke-virtual {p0, p1, v0}, LM2/a;->n(ILandroid/os/Parcel;)Landroid/os/Parcel;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-static {p2}, LH2/a$a;->o(Landroid/os/IBinder;)LH2/a;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    .line 28
    .line 29
    .line 30
    return-object p2
.end method

.method public final c1(LH2/a;Ljava/lang/String;ILH2/a;)LH2/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, LM2/a;->o()Landroid/os/Parcel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, LM2/c;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeInt(I)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0, p4}, LM2/c;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 15
    .line 16
    .line 17
    const/16 p1, 0x8

    .line 18
    .line 19
    invoke-virtual {p0, p1, v0}, LM2/a;->n(ILandroid/os/Parcel;)Landroid/os/Parcel;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-static {p2}, LH2/a$a;->o(Landroid/os/IBinder;)LH2/a;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    .line 32
    .line 33
    .line 34
    return-object p2
.end method

.method public final d1(LH2/a;Ljava/lang/String;I)LH2/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, LM2/a;->o()Landroid/os/Parcel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, LM2/c;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeInt(I)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x4

    .line 15
    invoke-virtual {p0, p1, v0}, LM2/a;->n(ILandroid/os/Parcel;)Landroid/os/Parcel;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-static {p2}, LH2/a$a;->o(Landroid/os/IBinder;)LH2/a;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    .line 28
    .line 29
    .line 30
    return-object p2
.end method

.method public final e1(LH2/a;Ljava/lang/String;ZJ)LH2/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, LM2/a;->o()Landroid/os/Parcel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, LM2/c;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, p3}, LM2/c;->c(Landroid/os/Parcel;Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p4, p5}, Landroid/os/Parcel;->writeLong(J)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x7

    .line 18
    invoke-virtual {p0, p1, v0}, LM2/a;->n(ILandroid/os/Parcel;)Landroid/os/Parcel;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-static {p2}, LH2/a$a;->o(Landroid/os/IBinder;)LH2/a;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    .line 31
    .line 32
    .line 33
    return-object p2
.end method

.method public final v()I
    .locals 2

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-virtual {p0}, LM2/a;->o()Landroid/os/Parcel;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {p0, v0, v1}, LM2/a;->n(ILandroid/os/Parcel;)Landroid/os/Parcel;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 15
    .line 16
    .line 17
    return v1
.end method
